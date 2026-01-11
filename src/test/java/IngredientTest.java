import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.Ingredient;
import praktikum.IngredientType;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {

	@ParameterizedTest
	@MethodSource("ingredientTestData")
	public void checkIngredients(IngredientType type, String name, float price) throws Exception {

		Ingredient ingredient = new Ingredient(type, name, price);

		String ingredientTestResult = "type: " + type + ", " + "name: " + name + ", " + "price: " + price + ".";
		System.out.println(ingredientTestResult);

		assertEquals("Ожидаемый и фактический Тип - совпадают: ", type,ingredient.getType());
		assertEquals("Ожидаемое и фактическое Имя - совпадают: ", name,ingredient.getName());
		assertEquals("Ожидаемая и фактическая Цена - совпадают: ", price,ingredient.getPrice(), 0);
	}

	private static Stream<Arguments> ingredientTestData() {
		return Stream.of(
				Arguments.of(FILLING, "cutlet", 100),
				Arguments.of(SAUCE, "chili sauce", 300)
		);
	}
}
