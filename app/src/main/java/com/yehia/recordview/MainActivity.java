package com.yehia.recordview;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private AudioRecorder audioRecorder;
    MediaPlayer mediaPlayer = null;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mediaPlayer = new MediaPlayer();
        audioRecorder = new AudioRecorder();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list_item);

//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new ItemsAudAdapter(this));
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
//        audioRecorder.stop();
//        if (recordFile != null && deleteFile) {
//            recordFile.delete();
//        }
    }

    private String getHumanTimeText(long milliseconds) {
        return String.format("%02d:%02d", TimeUnit.MILLISECONDS.toMinutes(milliseconds), TimeUnit.MILLISECONDS.toSeconds(milliseconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliseconds)));
    }


}
