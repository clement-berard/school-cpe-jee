package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "recipeService")
@ApplicationScoped
public class ResultatService {

	
	   public List<RecipeModelBean> createRecipes() {
	        List<RecipeModelBean> list = new ArrayList<RecipeModelBean>();
	        ExternalContext externalContext = FacesContext.getCurrentInstance()
					.getExternalContext();
			Map<String, Object> sessionMap = externalContext.getSessionMap();
			
	         
	        return (List<RecipeModelBean>) sessionMap.get("recipeList");
	    }
}
