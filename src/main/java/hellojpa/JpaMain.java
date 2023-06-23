package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
//            member.setId("ID_A");
            member.setUsername("C");
            Member member2 = new Member();
            member2.setUsername("C");
            Member member3 = new Member();
            member3.setUsername("C");
            Member member4 = new Member();
            member4.setUsername("C");
            em.persist(member);
            em.persist(member2);
            em.persist(member3);
            em.persist(member4);

            //비영속
//            Member member = new Member();
//
//            //영속
//            System.out.println("====BEFORE===");
//            em.persist(member);
//            System.out.println("====AFTER===");

            //m: 대상이 테이블이 아니라 객체를 대상으로 쿼리
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5)
//                    .setMaxResults(8)
//                    .getResultList();

            //          *select*
//            Member findMember = em.find(Member.class, 2L);

//          *update*
//            findMember.setName("HelloJPA");

//            *delete*
//            em.remove(findMember);

//            *create*
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("HelloB");
//            em.persist(findMember);
            tx.commit();

        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }



        emf.close();

    }
}
