import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class LabseqService {
  private baseUrl = 'http://localhost:8080';
  public error: string | null = null;

  constructor(private http: HttpClient) {}

  public getLabSeqValue(n: number): Observable<number> {
    this.error = null;
    const url = `${this.baseUrl}/labseq/${n}`;
    return this.http.get<number>(url).pipe();
    
  }
}
