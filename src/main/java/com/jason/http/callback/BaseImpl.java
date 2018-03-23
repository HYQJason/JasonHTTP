package com.jason.http.callback;

import android.content.Context;

import io.reactivex.disposables.Disposable;

/**
 * Created by jason on 17/5/11
 */

public interface BaseImpl {

    boolean addDisposable(Disposable disposable);

    Context getContext();

}
