package id.putraprima.courtcounter.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.courtcounter.models.Score;

public class CounterViewModels extends ViewModel {

    public MutableLiveData<Score> scoreMutableLiveData = new MutableLiveData<>();
    public Score score = new Score();

    public LiveData<Score> getScore(){
        return scoreMutableLiveData;
    }

    public void addPointHome(int point){
        score.setHomeScore(score.getHomeScore()+point);
        scoreMutableLiveData.setValue(score);
        Log.d("Point Home : ", String.valueOf(score.getHomeScore()));
    }

    public void addPointAway(int point){
        score.setAwayScore(score.getAwayScore()+point);
        scoreMutableLiveData.setValue(score);
        Log.d("Point Away : ", String.valueOf(score.getAwayScore()));
    }

    public void resetScore(int point){
        score.setAwayScore(point);
        score.setHomeScore(point);
        scoreMutableLiveData.setValue(score);
        Log.d("Point Away : ", String.valueOf(score.getAwayScore()));
        Log.d("Home Away : ", String.valueOf(score.getHomeScore()));
    }

    //TODO : Tambahkan Implementasi View Model Untuk Reset Point
}
