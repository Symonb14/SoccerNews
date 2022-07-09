package com.example.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.soccernews.domain.News;

import java.util.ArrayList;
import java.util.List;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> mNews;

    public NewsViewModel() {
        mNews = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News("Ferroviaria Tem Desfalque Importante", "A principal jogadora do time sofreu uma lesão no treino"));
        news.add(new News("Cruzeiro Joga No Sábado", "Com o atacante Edu em ótima fase."));
        news.add(new News("Time Feminino Do Atlético", "Meninas do Atlético sofre mais uma derrota dentro de casa"));

        mNews.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return mNews;
    }
}