import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.Bun;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class BunTest {

	@ParameterizedTest
	@MethodSource("bunTestData")
	public void checkBun(String name, float price) throws Exception {

		Bun bun = new Bun(name, price);

		String resultToString = "name= " + name + ", price= " + price + ".";
		System.out.println(resultToString);

		assertEquals("Ожидаемое и фактическое Имя - совпадают: ", name, bun.getName());
		assertEquals("Ожидаемая и фактическая Цена - совпадают: ", price, bun.getPrice(), 0);

	}

	private static Stream<Arguments> bunTestData() {
		return Stream.of(
				Arguments.of("black bun", 100),
				Arguments.of("white bun", 200)
		);
	}
}
