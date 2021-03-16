package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	Set <Word>dizionario= new HashSet<Word>();
	
	
	public void addWord(String alienWord, String translation) {
		Word parola = new Word();
		parola.setAlienWord(alienWord);
		parola.setTranslation(translation);
		boolean trovata=false;
		for(Word w:dizionario)
		{
		  if(parola.equals(w))
		  {
			w.setTranslation(translation);
		    trovata = true;
		  }
		}
		if(trovata==false)
		{
			dizionario.add(parola);
		}
		
		
	}
	
	public String translateWord(String alienWord) {
		for(Word w:dizionario)
		{
		  if(alienWord.equals(w.getAlienWord()))
		  {
			return w.getTranslation();
		  }
		}
		return null;
	}

}
