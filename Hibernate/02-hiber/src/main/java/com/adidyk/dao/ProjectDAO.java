package com.adidyk.dao;

import com.adidyk.models.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

/**
 * Class ProjectDAO.
 */
public class ProjectDAO implements DAO<Project, Integer> {

    /**
     * @param factory - session factory.
     */
    private final SessionFactory factory;

    /**
     * UserDAO - constructor.
     * @param factory - session factory.
     */
    public ProjectDAO(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     * checkProjectUpdate - check project update.
     * @param newProject - new project.
     * @param oldProject - old project.
     * @return - returns update project.
     */
    private Project checkProjectUpdate(Project newProject, Project oldProject) {
        if (newProject.getName() != null) oldProject.setName(newProject.getName());
        return oldProject;
    }

    /**
     * add - adds entity to database.
     * @param project - generic entity.
     */
    @Override
    public void add(Project project) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.save(project);
            session.getTransaction().commit();
        }
    }

    /**
     * update - updates entity in database.
     * @param newProject - generic entity.
     */
    @Override
    public void update(Project newProject) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.update(this.checkProjectUpdate(newProject, session.get(Project.class, newProject.getId())));
            session.getTransaction().commit();
        }
    }

    /**
     * remove - removes entity from database.
     * @param project - generic entity.
     */
    @Override
    public void remove(Project project) {
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            session.remove(project);
            session.getTransaction().commit();
        }
    }

    /**
     * get - gets entity from database by key.
     * @param id - generic key.
     * @return - returns entity from database by key.
     */
    @Override
    public Project get(Integer id) {
        Project project;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            project = session.get(Project.class, id);
            session.getTransaction().commit();
        }
        return project;
    }

    /**
     * getList - gets all entity from database.
     *
     * @return - returns list entity from database
     */
    @Override
    public List<Project> getList() {
        List<Project> list;
        try (Session session = this.factory.openSession()) {
            session.beginTransaction();
            list = session.createQuery("from Project AS p ORDER BY p.id DESC").list();
            session.getTransaction().commit();
        }
        return list;
    }

}