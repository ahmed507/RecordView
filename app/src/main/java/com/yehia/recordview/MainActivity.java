package com.yehia.recordview;

import static android.content.pm.PackageManager.PERMISSION_GRANTED;

import android.Manifest;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.yehia.phonicplayer.views.PhonicPlayerView;
import com.yehia.phonicplayer.views.PhonicPlayerView2;
import com.yehia.record_view.OnBasketAnimationEnd;
import com.yehia.record_view.OnRecordClickListener;
import com.yehia.record_view.OnRecordListener;
import com.yehia.record_view.RecordButton;
import com.yehia.record_view.RecordView;

import java.io.File;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private AudioRecorder audioRecorder;
    private File recordFile;
    MediaPlayer mediaPlayer = null;
    RecordView recordView;
    RecordButton recordButton;
    PhonicPlayerView2 phonicPlayerView;
    Button btnChangeOnclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = new MediaPlayer();
        audioRecorder = new AudioRecorder();

//        recordView = findViewById(R.id.record_view);
//        recordButton = findViewById(R.id.record_button);
        phonicPlayerView = findViewById(R.id.record_plays);
//        btnChangeOnclick = findViewById(R.id.btn_change_onclick);
    }

    @Override
    protected void onStart() {
        super.onStart();

        //IMPORTANT
//        recordButton.setRecordView(recordView);

        // if you want to click the button (in case if you want to make the record button a Send Button for example..)
//        recordButton.setListenForRecord(false);

//        btnChangeOnclick.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (recordButton.isListenForRecord()) {
//                    recordButton.setListenForRecord(false);
//                    Toast.makeText(MainActivity.this, "onClickEnabled", Toast.LENGTH_SHORT).show();
//                } else {
//                    recordButton.setListenForRecord(true);
//                    Toast.makeText(MainActivity.this, "onClickDisabled", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        //ListenForRecord must be false ,otherwise onClick will not be called
//        recordButton.setOnRecordClickListener(new OnRecordClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "RECORD BUTTON CLICKED", Toast.LENGTH_SHORT).show();
//                Log.d("RecordButton", "RECORD BUTTON CLICKED");
//            }
//        });

        //Cancel Bounds is when the Slide To Cancel text gets before the timer . default is 8
//        recordView.setCancelBounds(8);
//
//        recordView.setSmallMicColor(Color.parseColor("#c2185b"));
//
//        //prevent recording under one Second
//        recordView.setLessThanSecondAllowed(false);
//
//        recordView.setSlideToCancelText("Slide To Cancel");
//
//        recordView.setCustomSounds(R.raw.record_start, R.raw.record_finished, 0);

        phonicPlayerView.setAudioTarget("https://www.eroshen.com/up2/uploads/1445668835931.mp3?fbclid=IwAR1G3L02lfn2HBf__WcNAIXaqxwqcXPw7aUdzHPRFSwZzU7nRmPOjTNHwHQ", MainActivity.this);
//        recordView.setOnRecordListener(this, new OnRecordListener() {
//            @Override
//            public void onStart() {
//                recordFile = new File(getFilesDir(), UUID.randomUUID().toString() + ".3gp");
//
//            }
//
//            @Override
//            public void onCancel() {
//                stopRecording(true);
//
//                Toast.makeText(MainActivity.this, "onCancel", Toast.LENGTH_SHORT).show();
//
//                Log.d("RecordView", "onCancel");
//
//            }
//
//            @Override
//            public void onFinish(long recordTime, boolean limitReached, String file) {
//                stopRecording(false);
//
//                String time = getHumanTimeText(recordTime);
//                Toast.makeText(MainActivity.this, "onFinishRecord - Recorded Time is: " + time + " File saved at " + recordFile.getPath(), Toast.LENGTH_SHORT).show();
//                Log.d("RecordView", "onFinish" + " Limit Reached? " + limitReached);
//                Log.d("RecordTime", time);
//            }
//
//            @Override
//            public void onLessThanSecond() {
//                stopRecording(true);
//
//                Toast.makeText(MainActivity.this, "OnLessThanSecond", Toast.LENGTH_SHORT).show();
//                Log.d("RecordView", "onLessThanSecond");
//            }
//        });
//
//
//        recordView.setOnBasketAnimationEndListener(new OnBasketAnimationEnd() {
//            @Override
//            public void onAnimationEnd() {
//                Log.d("RecordView", "Basket Animation Finished");
//            }
//        });
//
//        recordView.setRecordPermissionHandler(() -> {
//            if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
//                return true;
//            }
//
//            boolean recordPermissionAvailable = ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.RECORD_AUDIO) == PERMISSION_GRANTED;
//            if (recordPermissionAvailable) {
//                return true;
//            }
//
//            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.RECORD_AUDIO}, 0);
//
//            return false;
//        });
    }

    private void stopRecording(boolean deleteFile) {
        audioRecorder.stop();
        if (recordFile != null && deleteFile) {
            recordFile.delete();
        }
    }


    @SuppressLint("DefaultLocale")
    private String getHumanTimeText(long milliseconds) {
        return String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(milliseconds), TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds)));
    }


}
