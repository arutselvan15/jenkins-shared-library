#!/usr/bin/env groovy

def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def error(message) {
    echo "ERROR: ${message}"
}

def banner(title) {
    echo ""
    echo "**************************************************"
    echo ${title}
    echo "**************************************************"
    echo ""
}
