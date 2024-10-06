@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {22, true},
                {17, false},
                {21, true},
                {18, true}
    };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
	    // Передай сюда возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("Должно вернуться " + isAdult, result, isAdult);
    }
}
