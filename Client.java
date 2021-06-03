public class Client {
	public static void main(String[] args) {
		GameListAggregate gameListAggregate = new GameListAggregate();
		gameListAggregate.add(new Game("みんなでゴルフ",3700));
		gameListAggregate.add(new Game("ファイナルファンタジア",7300));
		gameListAggregate.add(new Game("ロケットモンスター",5400));
		gameListAggregate.add(new Game("サイコロの達人",5200));
		Iterator iterator = gameListAggregate.createIterator();

		iterator.first();
		while(!iterator.isDone()) {
			Game game = (Game)iterator.getItem();
			System.out.println(game.getName());
			iterator.next();
		}
	}
}
