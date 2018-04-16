from django.conf.urls import url
from . import views

app_name = 'urlparts'

urlpatterns = [
	#url(r'^$', views.index, name='index'),
	url(r'^(?P<urlpart>[A-z0-9]+)/(?P<urlpart1>[A-z0-9]+)/$', views.index1, name='index'),
	url(r'^(?P<urlpart>[A-z0-9]+)/(?P<urlpart1>[A-z0-9]+)/(?P<urlpart2>[A-z0-9]+)/$', views.index2, name='index'),
	url(r'^(?P<urlpart>[A-z0-9]+)/(?P<urlpart1>[A-z0-9]+)/(?P<urlpart2>[A-z0-9]+)/(?P<urlpart3>[A-z0-9]+)/$', views.index3, name='index'),
]
