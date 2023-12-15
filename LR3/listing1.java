import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class listing1 {

	public static void main(String[] args) {
		//Создание объектта класса Scanner для считывания числа введенного в консоль
		Scanner id = new Scanner(System.in);
		//Сообщение пользоваттелю "для красоты и понимания"
		System.out.println("Введите размер массива: ");
		//Запись в переменную Size (нужная для того чтобы задать размер массива)
		int size = id.nextInt();
		//значения введенного в консоль
		System.out.println("Размер массива равен " + size);
		//Создание массива с размером введенного из консоли
		int[] nums = new int[size];
		//Создание объекта класса Ranndom для генерации "случайного" числа
		Random random = new Random();

		for (int i = 0; i < nums.length; i++){
			//Присвоение i-тому элементу массива случайного значение
			nums[i] = random.nextInt(200);
			//Сообщение польззоваелю для красоты и понимая
			System.out.println("Элемент массива ["+i+"] = " + nums[i]);
		}
		//Сортировка массива по возрастанию его элементов
		Arrays.sort(nums);
		//Сообщение пользователю для красоты и понимания
		System.out.println("Произведена сортировка массива");
		for(int i = 0; i < nums.length; i++){
			//Сообщение пользоваелю для красоты и понимания
			System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
		}
	}
}