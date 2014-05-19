package processing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import model.RecipeListModelBean;
import model.RecipeModelBean;
import dao.DaoFabric;
import dao.RecipesDao;

@ManagedBean(name = "lecontrollerecette")
@ApplicationScoped
public class RecipeControlerBean {
	private RecipesDao recipeDao;

	public RecipeControlerBean() {
		this.recipeDao = DaoFabric.getInstance().createRecipesDao();
	}

	public void loadAllRecipe() {
		ArrayList<RecipeModelBean> list = this.recipeDao.getAllRecipes();

		RecipeListModelBean recipeList = new RecipeListModelBean();

		for (RecipeModelBean recipe : list) {
			recipeList.addRecipeList(recipe);
		}

		// récupère l'espace de mémoire de JSF
		ExternalContext externalContext = FacesContext.getCurrentInstance()
				.getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();

		// place la liste de recette dans l'espace de mémoire de JSF
		sessionMap.put("recipeList", recipeList);

	}

	public void searchRecette(RecipeModelBean recette) throws IOException {

		ArrayList<RecipeModelBean> list = this.recipeDao
				.getAllSearchRecipes(recette);

		RecipeListModelBean recipeList = new RecipeListModelBean();

		for (RecipeModelBean recipe : list) {
			recipeList.addRecipeList(recipe);
		}

		// récupère l'espace de mémoire de JSF
		ExternalContext externalContext = FacesContext.getCurrentInstance()
				.getExternalContext();
		Map<String, Object> sessionMap = externalContext.getSessionMap();

		// place la liste de recette dans l'espace de mémoire de JSF
		sessionMap.put("recipeList", recipeList);
		externalContext.redirect("resultat.jsf");
	}

}
