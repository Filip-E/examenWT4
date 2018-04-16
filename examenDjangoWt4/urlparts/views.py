# -*- coding: utf-8 -*-
from __future__ import unicode_literals
from .models import Urlpart

from django.shortcuts import render

# Create your views here.

def index1(request, urlpart, urlpart1):
    list = [urlpart, urlpart1]
    listStr = '--'.join(list)
    urlpartObject = Urlpart(url_part = listStr)
    urlpartObject.save()
    url_parts = Urlpart.objects.all()

    return render(request, 'urlparts/index.html', {'url_parts': url_parts})

def index2(request, urlpart, urlpart1, urlpart2):
    list = [urlpart, urlpart1, urlpart2]
    listStr = '--'.join(list)
    urlpartObject = Urlpart(url_part = listStr)
    urlpartObject.save()
    url_parts = Urlpart.objects.all()

    return render(request, 'urlparts/index.html', {'url_parts': url_parts})

def index3(request, urlpart, urlpart1, urlpart2, urlpart3):
    list = [urlpart, urlpart1, urlpart2, urlpart3]
    listStr = '--'.join(list)
    urlpartObject = Urlpart(url_part = listStr)
    urlpartObject.save()
    url_parts = Urlpart.objects.all()

    return render(request, 'urlparts/index.html', {'url_parts': url_parts})
