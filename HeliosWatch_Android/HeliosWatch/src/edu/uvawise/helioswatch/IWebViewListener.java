/*
 * Copyright (C) 2014 The Retro Watch - Open source smart watch project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.uvawise.helioswatch;

public interface IWebViewListener {
	
	public static final int WEBVIEW_CALLBACK_ADD_FEED = 1;
	
	public void OnReceiveDialogEvent(int type, int arg0, String arg1, String arg2);
	public void OnReceiveCallback(String id, int type, int arg0, String arg1, String arg2, String arg3, String arg4);
}
