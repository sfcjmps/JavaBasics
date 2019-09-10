package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DepartmentCrud {
	public List<Department> ShowDepartment(){
		    	 SessionFactory sf=HibernateUtil.getConnection();
		    	 Session s=sf.openSession();
		    	 Query q=s.createQuery("from Department");
		    	 List<Department> lst=q.list();
		    	 return lst;
    }
	public Department searchDepartment(int deptno){
		SessionFactory sf = HibernateUtil.getConnection();
		Session s = sf.openSession();
		Query q = s.createQuery("from Department where deptno = " + deptno );
		Department ems = null;
		List<Department> lst = q.list();
		if (lst.size() != 0) {
			ems = lst.get(0);
		}
		return ems;
	}
}





