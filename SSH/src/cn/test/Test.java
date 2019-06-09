package cn.test;

import cn.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
  public static void main(String[] args) {
    Student stu=new Student();
    stu.setId(1);
    stu.setName("呵");
    stu.setAge(12);
    Configuration cfg=new Configuration().configure();
    SessionFactory sc = cfg.buildSessionFactory();

    Session se = sc.openSession();
    Transaction tx=se.beginTransaction();

    se.save(stu);
    tx.commit();
    System.out.println("success!!!");
  }
}
