//Классическая игра змейка
//  Механика игра: начальная частота таймера 1000млс/ 5, скорость змейки 5 клеток/сек
//    яблоко появляется в любой клетке в случайном порядке
//    скорость змейки возростает после каждого сьединого яблока на 1 клетку в сек
//    размер змейки увеличивается на 1 элемент после каждого сьединого яблока до предельной длинны массива-змейки
//    пробел - остановка таймера, пауза
//    таймер запускает метод move() - перемещение змейки на 1 клетку, 
//    все элементы змейки перестраиваются на место стоящих перед ними а голова в зависимости от значения поля direction; 
//    s - отключение разметки сетки на игровом поле
//    реализация перемещения змейки на противоположную сторону игрового поля при  пересечении его границ
//    запрет на смену поля direction( на смену направления на противоположное)
//    штраф/ограничение  возможности змейки проходить сквозь себя
                 
package Snake1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameSnake {

	public static void main(String[] args) {

	    
		GameBoard snakeBoard = new GameBoard();
		
		

	}

}
