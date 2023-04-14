package br.com.gameslibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gameslibrary.model.Game;

@Service
public class GameService {
	
	public GameService() {}
	@Autowired
	private static List<Game>  games;
	static {
		games.add(new Game(1, "Super Mario World"));
		games.add(new Game(2, "Megaman X"));
	}
	
	public List<Game> listAll(){
		return games;
	}
}
