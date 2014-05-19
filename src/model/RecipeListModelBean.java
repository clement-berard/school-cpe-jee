package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "recipeList")
@RequestScoped
public class RecipeListModelBean {
	private List<RecipeModelBean> recipeList;
	
	public RecipeListModelBean() {

		recipeList=new ArrayList<RecipeModelBean>();	
	}
	
	public void addRecipeList(RecipeModelBean recipe){
		this.recipeList.add(recipe);
	}
	
	public List<RecipeModelBean> getRecipeList() {
		return recipeList;
	}
	
	

}
