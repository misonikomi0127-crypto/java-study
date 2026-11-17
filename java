package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class Todo {
	static ArrayList<String>tasks = new ArrayList<>();
	
	public static void addTask(String task) {
		tasks.add(task);
		System.out.println("追加されました:" + task);
	}

	public static void viewTasks() {
		if(tasks.isEmpty()) {
			System.out.println("タスクはありません。");
		}else {
			System.out.println("タスク一覧:");
			for(int i = 0; i < tasks.size(); i++) {
				System.out.println((i + 1) + ":" + tasks.get(i));
			}
		}
	}
	
	public static void deleteTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			String removed = tasks.remove(index);
			System.out.println("削除されました:" + removed);
		}else {
			System.out.println("番号が正しくありません");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("\n1.タスク追加 2. 表示 3. 削除 4. 終了");
			String input = scanner.nextLine();
			switch(input) {
			case"1":
				System.out.println("追加するタスク:");
				String task = scanner.nextLine();
				addTask(task);
				break;
			case"2":
				viewTasks();
				break;
			case"3":
				System.out.print("削除する番号:");
				int idx = Integer.parseInt(scanner.nextLine())-1;
				deleteTask(idx);
				break;
			case"4":
				System.out.println("終了します。");
				scanner.close();
				return;
			default:
				System.out.println("無効な入力です");
					
	
			
			}
		}
	}
}

