# PlantDiseaseDetector
Plant disease detector

# Objective
The Reason I Have Selected This Topic is because it allows it to be a fully functional android application that will help detect and classify plant diseases. It is also a helpful medium for farmers to take appropriate measures of treatment. Early detection of plant diseases is necessary for effective control. The occurrence of the disease on the plant may result in significant loss in both quality as well as the quantity of agricultural product.
This can produce the negative impact on the countries whose economies are primarily dependent on the agriculture. Hence the detection of the disease in the earlier stages is very important to avoid the loss in terms of quality, quantity and finance.

# Module Description:

i.	Login/Registration: This module will allow a user to login or either register themselves with a user-id, username, contact number and password. In case of login validation would be performed from the database before directing to the image scan screen. Whereas in case of sign up the details will be stored in the database for further validation.

ii.	Image upload/scan: Creating a module for scanning or uploading images from gallery and a dataset of pictures of diseased and healthy plant leaves under controlled conditions.

iii.	Disease Detection: Setting up data generators that will read pictures, convert them and feed them (with their labels) to our network and detect whether the given plant has disease or not.

iv.	Treatment: If a disease is detected, them on click of a button on the previous module this module will open and the method to cure the disease will be displayed.


# how to run:

i. Train the model by using the plant disease dataset. 
ii. Convert the model to tflite.
iii. save the model.
iv. Put the model in the asset directory of the project.
v. Create a firebase project and enable authentication and realtime database. 
vi. Download google.json file and put it in the required directory.
vii. PS: the code will run without doing the above steps if you dont want to configure it at all XD.

# Language used :
Java
Python for training model.
# Platform used
Android studio IDE
Google Collab for training model.
Kaggle for the dataset

# dataset URL

https://www.kaggle.com/kalpeshkhandelwal/plantvillagek

# Machine Learning Code for Collab.
https://colab.research.google.com/drive/1-phA7P8lGcoyxpnkns3KnshuBy76dXnY?usp=sharing

Ps: you have to upload a Kaggle.json file which you will get from your kaggle account after activating api . https://medium.com/analytics-vidhya/how-to-fetch-kaggle-datasets-into-google-colab-ea682569851a Yo can follow this to get the json file.
Upload the json file directly to collab .

Treatment might not work because You need to add data manually to firebase.

ping me if you have any issue .
# happy to help




