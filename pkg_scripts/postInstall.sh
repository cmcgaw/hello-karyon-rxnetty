#!/bin/bash

PATH="$PATH":/usr/lib/google-cloud-sdk/bin/
export BOTO_CONFIG="/home/cmcgaw/.boto"

gsutil cp gs://mycred/access.json home/cmcgaw
export GOOGLE_APPLICATION_CREDENTIALS="home/cmcgaw/access.json"

# create log folder
install  --mode=755 --directory  /var/log/hello-karyon-rxnetty


# start services
start hello-karyon-rxnetty


