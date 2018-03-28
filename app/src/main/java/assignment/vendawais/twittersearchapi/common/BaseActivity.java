package assignment.vendawais.twittersearchapi.common;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import assignment.vendawais.twittersearchapi.application.TwitterSearchApplication;
import assignment.vendawais.twittersearchapi.di.component.AppComponent;

/**
 * Created by syed.awais.mazhar on 1/8/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupComponent(((TwitterSearchApplication) this.getApplicationContext()).component());
    }

    protected abstract void setupComponent(AppComponent appComponent);

/*    @TargetApi(Build.VERSION_CODES.N)
    static int hasSingleMaximum(int[] a) {

        if (a.length == 0)
            return 0;
        if (a.length == 1)
            return 1;
        List<Integer> list = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        if (list.get(0) == list.get(1))
            return 0;

        return 1;
    }

    public static int is121Array(int[] a) {
        int i, countOnes = 0, countTwos = 0, countOnesInEnd = 0, countOnesInStart = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                countOnes++;
            }
            if (a[i] == 2) {
                countTwos++;
            }
            if (a[i] != 1 && a[i] != 2)
                return 0;
        }
        if (countOnes == 0 || countOnes / 2 == 0 || countTwos == 0)
            return 0;
        int length = a.length;
        for (i = 0; i < length / 2; i++) {
            if (a[i] == 1) {
                countOnesInStart++;
            }
        }
        for (i = a.length - 1; i >= length / 2; i--) {
            if (a[i] == 1) {
                countOnesInEnd++;
            }
        }
        if (countOnesInEnd == countOnesInStart)
            return 1;
        else
            return 0;
    }

}*/

}
