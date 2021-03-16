package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	Set <WordEnhanced>dizionario= new HashSet<WordEnhanced>();
	
	
	public void addWord(String alienWord, String translation) {
		WordEnhanced parola = new WordEnhanced();
		parola.setAlienWord(alienWord);
		parola.translation.add(translation);
		boolean trovata=false;
		for(WordEnhanced w:dizionario)
		{
		  if(parola.equals(w))
		  {
			w.translation.add(translation);
		    trovata = true;
		  }
		}
		if(trovata==false)
		{
			dizionario.add(parola);
		}
		
		
	}
	
	public List<String> translateWord(String alienWord) {
		for(WordEnhanced w:dizionario)
		{
		  if(alienWord.equals(w.getAlienWord()))
		  {
			return w.getTranslation();
		  }
		}
		return null;
	}

}
