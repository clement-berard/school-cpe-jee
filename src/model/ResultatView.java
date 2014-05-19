package model;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ResultatView implements Serializable{

    private List<RecipeModelBean> listRecipes;
    
     
    @ManagedProperty("#{recipeService}")
    private ResultatService service;
     
    @PostConstruct
    public void init() {
    	listRecipes = service.createRecipes();
    }
}
