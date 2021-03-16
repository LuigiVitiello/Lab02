package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	List<String>translation = new LinkedList<String>();

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alienWord == null) ? 0 : alienWord.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WordEnhanced other = (WordEnhanced) obj;
		if (alienWord == null) {
			if (other.alienWord != null)
				return false;
		} else if (!alienWord.equals(other.alienWord))
			return false;
		return true;
	}
	public String getAlienWord() {
		return alienWord;
	}
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	public List<String> getTranslation() {
		return translation;
	}
	public void setTranslation(List<String> translation) {
		this.translation = translation;
	}

	

}
