package at.lestoph.wuwald.model;

import at.lestoph.wuwald.entity.RecipeEntity;

import java.util.List;

/**
 * Created by Howl on 12/18/2015.
 */
public interface AddListModel {
    List<RecipeEntity> addAndList(String ingredients, String instructions);
}
