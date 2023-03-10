
package com.nurfaozan.crudmahasiswasederhana.interfc;

import com.nurfaozan.crudmahasiswasederhana.models.Mahasiswa;
import java.sql.SQLException;
import java.util.List;

public interface MahasiswaInterface {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    
    void update (Mahasiswa o) throws SQLException;
    
    void delete (String nim) throws SQLException;
    
    List<Mahasiswa> getAll() throws SQLException;

}
