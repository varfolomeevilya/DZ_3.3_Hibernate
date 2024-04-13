package org.hiberexample.dao;

import org.hiberexample.config.DBHibernateConfig;
import org.hiberexample.entity.Car;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CarDAOHibernateImpl implements CarDAO{
    @Override
    public void createTable(){
        String sql = """
                Create TABLE IF NOT EXISTS car (
                id BIGSERIAL PRIMARY KEY,
                name VARCHAR(40),
                max_speed INTEGER
//                county_code VARCHAR(2)
                )
                """;
        try (SessionFactory sessionFactory = DBHibernateConfig.getSession()){
            Session session = sessionFactory.openSession();

            Transaction tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();

            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void dropTable(){
        String sql = """
                DROP TABLE IF EXISTS car;
                """;
        try(SessionFactory sessionFactory = DBHibernateConfig.getSession()) {
            Session session = sessionFactory.openSession();

            Transaction tx = session.beginTransaction();
            session.createSQLQuery(sql).executeUpdate();
            tx.commit();

            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void saveCar(Car car) {
        System.out.println("Подготовлен запрос на сохранение сущности Plane: \n" + car.toString());

        try (SessionFactory sessionFactory = DBHibernateConfig.getSession()) {
            Session session = sessionFactory.openSession();

            Transaction tx = session.beginTransaction();
            session.save(car);
            tx.commit();

            System.out.println("Успешно сохранена сущность Plane! \n" );

            session.close();
        } catch (Exception e) {
            System.out.println("ОШИБКА!!!!!!!!!!!!!!");
            e.printStackTrace();
        }
    }
    @Override
    public void deleteCarById(Long id){
        String sql = """
                DELETE FROM Car c
                WHERE c.id = :id 
                """;

        try(SessionFactory sessionFactory = DBHibernateConfig.getSession();) {
            Session session = sessionFactory.openSession();
            Transaction tx = session.beginTransaction();

            session.createQuery(sql)
                    .setParameter("id", id)
                    .executeUpdate();

            tx.commit();
//            System.out.println("Успешно удалена сущность Car с id = "+ id);
            session.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    @Override
    public List<Car> getAll(){
        String sql = " FROM Car";

        SessionFactory sessionFactory = DBHibernateConfig.getSession();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        List<Car> cars = session.createQuery(sql).getResultList();

        tx.commit();
        session.close();

        return cars;
    }
}
