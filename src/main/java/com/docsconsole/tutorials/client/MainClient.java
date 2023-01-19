package com.docsconsole.tutorials.client;

import com.docsconsole.tutorials.entity.Person;
import com.docsconsole.tutorials.utils.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.*;
import java.util.List;

public class MainClient {


    public static void main(String[] args) {

        System.out.println("The main method@MainClient");

        EntityManager entityManager = JPAUtils.getEntityManagerFactory().createEntityManager();
        EntityTransaction transaction = null;
        try {

            transaction = entityManager.getTransaction();
            transaction.begin();

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            List<Person> results = entityManager.createQuery(criteriaQuery).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.equal( root.get("firstName" ), "Johnson" ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.notEqual( root.get("firstName" ), "Johnson" ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.like( root.get("firstName" ), "%son%" ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

           /* CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( root.get("lastName" ).in( "David", "Mike" ));
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.lt( root.get("age" ), 35 ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.gt( root.get("age" ), 35 ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.between( root.get("age" ), 45,60 ) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.isNull( root.get("income" )) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root );
            criteriaQuery.where( builder.isNotNull( root.get("income" )) );
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
            Root<Person> root = criteriaQuery.from(Person.class);
            Path<Long> firstNamePath = root.get("firstName");
            Path<String> lastNamePath = root.get("lastName");
            criteriaQuery.multiselect(firstNamePath, lastNamePath);
            criteriaQuery.where(builder.equal(root.get("age"), 34));
            List<Object[]> results = entityManager.createQuery(criteriaQuery).getResultList();
            results.stream()
                    .map(objects ->
                            "firstName: " + objects[0] + "and lastName: " + objects[1]).forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery criteriaQuery = builder.createQuery(Object[].class);
            Predicate[] predicates = new Predicate[2];
            Root<Person> root = criteriaQuery.from(Person.class);
            predicates[0] = builder.isNotNull( root.get("income" ));
            predicates[1] = builder.like( root.get("firstName" ), "%son%" );
            criteriaQuery.select(root).where(predicates);
            List<Person> results = entityManager.createQuery(criteriaQuery).getResultList();
            results.stream().forEach(System.out::println);*/


           /* CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Person> criteriaQuery = builder.createQuery( Person.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select( root ).orderBy(builder.desc(root.get("age")));
            List<Person> results = entityManager.createQuery( criteriaQuery ).getResultList();
            results.stream().forEach(System.out::println);*/

           /* CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Long> criteriaQuery = builder.createQuery( Long.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select(builder.count(root));
            List<Long> results = entityManager.createQuery(criteriaQuery).getResultList();
            results.stream().forEach(System.out::println);*/

            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Double> criteriaQuery = builder.createQuery( Double.class );
            Root<Person> root = criteriaQuery.from( Person.class );
            criteriaQuery.select(builder.avg(root.get("age")));
            List<Double> results = entityManager.createQuery(criteriaQuery).getResultList();
            results.stream().forEach(System.out::println);*/


           /* CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaDelete<Person> criteriaDelete = builder.createCriteriaDelete(Person.class);
            Root<Person> root = criteriaDelete.from( Person.class );
            criteriaDelete.where(builder.greaterThan(root.get("age"),50));
            entityManager.createQuery(criteriaDelete).executeUpdate();*/


            /*CriteriaBuilder builder = entityManager.getCriteriaBuilder();
            CriteriaUpdate<Person> criteriaUpdate = builder.createCriteriaUpdate(Person.class);
            Root<Person> root = criteriaUpdate.from( Person.class );
            criteriaUpdate.set("age",51);
            criteriaUpdate.where(builder.equal(root.get("id"),1002));
            entityManager.createQuery(criteriaUpdate).executeUpdate();*/

            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            entityManager.close();
        }
    }


}
