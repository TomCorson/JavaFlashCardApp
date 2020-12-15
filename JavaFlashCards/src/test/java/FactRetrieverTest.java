import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FactRetrieverTest {
    private FactRetriever factRetriever;
    private Connection connection = ConnectionFactory.getConnection();
    @Before
    public void init(){
        factRetriever = new FactRetriever();
    }

    @Test
    public void findByIdTest(){
        String expected = "";
        String actual = factRetriever.findById(1);
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from Facts where id= 1;");
            if(rs.next()){
                FlashCard fc = new FlashCard();
                fc.setId(rs.getInt("id"));
                fc.setFact(rs.getString("fact"));
                expected = fc.getFact();
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals(expected,actual);

    }

    @org.junit.Test
    public void randomId() {
       int num = 10;
      int rand = factRetriever.randomId(num);
      for(int i = 0; i < 50;i++){
          assertTrue(rand > 0 && rand < 10);
      }

    }
}