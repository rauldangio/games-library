package br.com.gameslibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gameslibrary.model.Game;
import br.com.gameslibrary.service.GameService;

@RestController
@RequestMapping("games")
public class GameController {

	
	
//	@Autowired
//	public GameController(GameService gameService) {
//		this.gameService = gameService;
//	}
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<Game>> listAll(){
		return new ResponseEntity<List<Game>>(gameService.listAll(), HttpStatus.OK);
	}
}
