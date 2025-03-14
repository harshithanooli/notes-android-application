#  Title
Android notes application

# Description
- This project is a notes android application.
- It allows users to create, edit, and delete notes, storing them in a Firebase Firestore database. 
- The application features a login screen, a notes listing screen, and a detailed note editing screen. 
- Firebase Authentication is used to manage user login authentication.
  
**##Requiremnts**
Kotlin (version 2.1.0), Firebase (for authentication and firebase database for storing notes data), Android Studio

## Functionality
*   [x] User sees a login screen upon launching the app.
*   [x] User can log in using predefined username/passwords (no sign-up).
*   [x] After successful login, the user sees a notes listing screen (RecyclerView).
*   [x] Each note has a title and a description.
*   [x] User can tap the "Add Note" button to navigate to the Note Fragment to create a new note.
*   [x] User can tap on a note title in the RecyclerView to navigate to the Note Fragment to edit that note.
*   [x] The Note Fragment displays the title and description of the selected note for editing.
*   [x] User can save notes which are stored in a Firebase Firestore database.
*   [x] User can delete a note by tapping the delete button on a note.
*   [x] A confirmation dialog appears when the delete button is tapped, prompting the user to confirm the deletion.
*   [x] Notes are displayed in the RecyclerView.
*   [x] Automatic logout when the app is stopped or paused.
*   [x] The notes shown in the recycler view of app are ordered by the recently added note creation time.
  
## License
Copyright [2025] [HARSHITHA NOOLI]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

