import {Component, OnInit} from '@angular/core';
import {interval, Observable} from 'rxjs';
import {map} from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public value$: Observable<number>;

  ngOnInit() {
    window.watsonAssistantChatOptions = {
      integrationID: '8aaf0649-2bd3-4a0d-bc98-43171e844ef0', // The ID of this integration.
      region: "eu-gb", // The region your integration is hosted in.
      serviceInstanceID: "d6fc2b24-36be-48ad-b746-123dc6f34d58", // The ID of your service instance.
      onLoad: function(instance) { instance.render(); }
    };
    setTimeout(function(){
      const t=document.createElement('script');
      t.src="https://web-chat.global.assistant.watson.appdomain.cloud/loadWatsonAssistantChat.js";
      document.head.appendChild(t);
    });

    this.value$ = interval(10000).pipe(
      map(() => Math.random() * 100)
    );
}
}
