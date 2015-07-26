package daos

import play.api.Play.current
import play.api.db.DB

class NumberDao {

  def generateNumbers(): List[Int] = {
    val conn = DB.getConnection()

    var resultList = List.empty[Int]
    try {
      val stmt = conn.createStatement
      val rs = stmt.executeQuery("SELECT numb from test_table")

      while (rs.next()) {
        resultList = resultList :+ rs.getInt("numb")
      }
    } finally {
      conn.close()
    }

    resultList
  }

}
