import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.IngredientType;

import java.util.stream.Stream;

import static org.junit.Assert.assertNotNull;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTypeTest {

	@ParameterizedTest
	@MethodSource("ingredientTypeTestData")
	public void checkIngredientType(IngredientType ingredientType) {

		System.out.println(ingredientType);

		assertNotNull(ingredientType);
	}

	private static Stream<Arguments> ingredientTypeTestData() {
		return Stream.of(
				Arguments.of(IngredientType.SAUCE),
				Arguments.of(IngredientType.FILLING)
		);
	}
}
