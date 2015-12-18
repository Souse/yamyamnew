package at.lestoph.wuwald.model.impl;

/**
 * Created by Howl on 12/18/2015.
 */
import at.lestoph.wuwald.entity.RecipeEntity;
import at.lestoph.wuwald.model.AddListModel;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


public class AddListModelImpl implements AddListModel {

    @Override
    public List<RecipeEntity> addAndList(String ingredients, String instructions) {
        EntityManager entityManager = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME").createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        List<RecipeEntity> list = null;
        try {
            transaction.begin();
            RecipeEntity entity = new RecipeEntity();
            entity.setIngredients(ingredients);
            entity.setInstructions(instructions);
            entityManager.persist(entity);
            TypedQuery<RecipeEntity> nq = entityManager.createNamedQuery("list", RecipeEntity.class);
            list = nq.getResultList();
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        } finally {
            entityManager.clear();
            entityManager.close();
        }
        return list;
    }

}