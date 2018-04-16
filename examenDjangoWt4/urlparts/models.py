# -*- coding: utf-8 -*-
from __future__ import unicode_literals

from django.db import models

# Create your models here.
class Urlpart(models.Model):
    url_part = models.CharField(max_length=50)

    def __unicode__(self):
        return self.url_part
    def __str__(self):
        return self.url_part
