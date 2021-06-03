interface Iterator {
	public void first();		//取り出し市を最初の要素へ
	public void next();		//取り出し位置を次の要素へ
	public boolean isDone();	//取り出し位置が最後か
	public Object getItem();	//現在の取り出し位置から取り出す
}
