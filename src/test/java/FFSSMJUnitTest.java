/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import FFSSM.Club;
import FFSSM.Licence;
import FFSSM.Moniteur;
import FFSSM.Personne;
import FFSSM.Plongeur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author QUENTIN
 */
public class FFSSMJUnitTest {
    
    Personne untel;
    Moniteur Untel;
    Plongeur p;
    Licence l;
    Club club;
    
   
    
    
    @BeforeEach
    public void setUp() {
        untel = new Personne ("141068078200557","Dupont","Jean","30 Chemin des moulins Castres","0654985711",'1998-08-11');
        Untel = new Moniteur ("141068078200557","Dupont","Jean","30 Chemin des moulins Castres","0654985711",1998-08-11,3);
        p = new Plongeur ("141068078200557","Dupont","Jean","30 Chemin des moulins Castres","0654985711",1998-08-11,1);
        club = new Club (Untel,"Tullip","0648723694");
        l = new Licence (untel,"102",2019-04-25,2,club);
    }
    
    @Test
    public void testNumINSEE() {
    assertFalse (untel.numeroINSEE == null);
    }
    
    
}
