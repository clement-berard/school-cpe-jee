package model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "larecette")
@SessionScoped
public class RecipeModelBean implements Serializable{
	private String title;
	private String description;
	private int expertise;
	private int nbpeople;
	private String duration;
	private String type;
	
	public RecipeModelBean() {
	}
	
	
	public RecipeModelBean(String title,String description,int expertise,String duration,int nbpeople,String type) {
		this.title = title;
		this.description = description;
		this.expertise = expertise;
		this.duration = duration;
		this.nbpeople = nbpeople;
		this.type = type;
	}
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getExpertise() {
		return expertise;
	}
	public void setExpertise(int expertise) {
		this.expertise = expertise;
	}
	public int getNbpeople() {
		return nbpeople;
	}
	public void setNbpeople(int nbpeople) {
		this.nbpeople = nbpeople;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}


	@Override
	public String toString() {
		return "RecipeModelBean [title=" + title + ", description="
				+ description + ", expertise=" + expertise + ", nbpeople="
				+ nbpeople + ", duration=" + duration + ", type=" + type + "]";
	}
	
	
}
