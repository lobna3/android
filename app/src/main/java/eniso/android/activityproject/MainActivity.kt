package eniso.android.activityproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import eniso.android.activityproject.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //charger notre activity Repository
       // val repo= ActivityRepository()

        // maitre à jour la liste activity
       // repo.updateData()

        //Injecter le Fragments dans notre boite(fragment_container)

        val transaction= supportFragmentManager.beginTransaction()
       transaction.replace(R.id.fragment_container, HomeFragment())
         transaction.addToBackStack(null)
         transaction.commit()

    }
}