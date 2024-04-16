import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TinhTongTest {

    @Test
    public void testTinhTong() {
        // Arrange
        double soThuNhat = 5.5;
        double soThuHai = 4.5;
        double expected = 10.0;

        // Act
        double actual = tinhTong(soThuNhat, soThuHai);

        // Assert
        assertEquals(expected, actual, 0.001); // Đối số thứ ba là sai số cho phép
    }

    // Hàm tính tổng được sử dụng trong testcase
    private double tinhTong(double soThuNhat, double soThuHai) {
        return soThuNhat + soThuHai;
    }
}
