#!/bin/bash
export GOOGLE_APPLICATION_CREDENTIALS="/home/user/Downloads/[FILE_NAME].json"

# create log folder
install  --mode=755 --directory  /var/log/hello-karyon-rxnetty



# start services
start hello-karyon-rxnetty


