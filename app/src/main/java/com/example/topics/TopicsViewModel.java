package com.example.topics;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TopicsViewModel extends ViewModel {
    private MutableLiveData<Topic> slectedTopic=new MutableLiveData<>();

    public LiveData<Topic> getSlectedTopic() {
        return slectedTopic;
    }

    public void setSlectedTopic(Topic slectedTopic) {
        this.slectedTopic.postValue(slectedTopic);
    }
}
