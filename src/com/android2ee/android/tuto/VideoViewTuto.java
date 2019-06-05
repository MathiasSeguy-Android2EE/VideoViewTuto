/**
 * <ul>
 * Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
 * Produced by <strong>Dr. Mathias SEGUY</strong> with the smart contribution of <strong>Julien PAPUT</strong>.</br>
 * Delivered by <strong>http://android2ee.com/</strong></br>
 * Belongs to <strong>Mathias Seguy</strong></br>
 * ****************************************************************************************************************</br>
 * This code is free for any usage but can't be distribute.</br>
 * The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
 * The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br>
 * </br>
 * For any information (Advice, Expertise, J2EE or Android Training, Rates, Business):</br>
 * <em>mathias.seguy.it@gmail.com</em></br>
 * *****************************************************************************************************************</br>
 * Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
 * Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
 * Sa propriété intellectuelle appartient à <strong>Mathias Séguy</strong>.</br>
 * <em>http://mathias-seguy.developpez.com/</em></br>
 * </br>
 * Pour tous renseignements (Conseil, Expertise, Formations J2EE ou Android, Prestations, Forfaits):</br>
 * <em>mathias.seguy.it@gmail.com</em></br>
 * *****************************************************************************************************************</br>
 * Merci à vous d'avoir confiance en Android2EE les Ebooks de programmation Android.
 * N'hésitez pas à nous suivre sur twitter: http://fr.twitter.com/#!/android2ee
 * N'hésitez pas à suivre le blog Android2ee sur Developpez.com : http://blog.developpez.com/android2ee-mathias-seguy/
 * *****************************************************************************************************************</br>
 * com.android2ee.android.tuto</br>
 * 25 mars 2011</br>
 */
package com.android2ee.android.tuto;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * @author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals This class aims to:
 *        <ul>
 *        <li></li>
 *        </ul>
 */
public class VideoViewTuto extends Activity {
	MediaController mediaController;
	VideoView videoView;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		videoView = (VideoView) findViewById(R.id.VideoView);
		String path
		// For youTube there are others ways to do
		// ="http://www.youtube.com/watch?v=oJDEHvqIj-8&list=FLCxnZ7N8-BoaTTv8G5VC5vA";
		//
		= "http://www.4shared.com/video/ZHTdVkA6/Black_Cat_08.html?cau2=403tNull";
		
		// Uri video =
		// Uri.parse("android.resource://com.android2ee.android.tuto.VideoViewTuto/drawable-ldpi/fail");

		mediaController = new MediaController(this);
		mediaController.setMediaPlayer(videoView);

		videoView.setVideoPath(path);
		// videoView.setVideoURI(video);
		videoView.setMediaController(mediaController);

		videoView.requestFocus();
		videoView.start();
		mediaController.show();
	}
}