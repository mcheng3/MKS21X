public class SlidingPuzzle{
	private int side;
	private int[][] values;
	public SlidingPuzzle(int sideLength){
		side = sideLength;
		values = new int[side][side];
		int counter = 0;
		for(int x = 0; x < side; x++){
			for(int y = 0; y< side; y++){
				values[x][y] = counter;
				counter++;
			}
		}
	}

	public boolean isDone(){
		int count = 1;
		for(int[] row : values){
			for(int each : row){
				System.out.println(count+ ":" +each);
				if(each == 0);
				else if(count == each) count++;
				else return false;
			}
		}

		return true;
	}
	public boolean isDone2(){
		int count = 1;
		int hold;
		for(int[] row : values){
			for(int each : row){
			
			}
		}

		return true;
	public static void main(String[] args){
		SlidingPuzzle x = new SlidingPuzzle(5);
		System.out.println(x.isDone());
	}
}

